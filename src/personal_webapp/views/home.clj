(ns personal-webapp.views.home
  (:require [clojure.string :as str]
            [personal-webapp.views.common :refer [gen-nav-bar gen-content-container]]
            [hiccup.page :as page :refer [include-css]]
            [hiccup.core]
            [ring.util.anti-forgery :as util]))

(defn summary
  []
  (hiccup.core/html
    [:div
     [:div {:class 'center}
      [:h2 {:class 'heading}
       "About"]]
     [:p {:class 'paragraph}
      "Welcome to my work-in-progress website.
      It is made using as much Clojure as I can try to use, making use of Ring, Compojure, Garden, and Hiccup to name a few.
      While I'm sure I'm not using these frameworks to their full potential, the point of this website is to learn Clojure, start
      recording some of the interesting programming hurdles I jump over (or fall on my face trying to solve) and host some web-app related projects."]]))


(defn get-latest-blog-post-contents
  []
  (str/split-lines
    (slurp
      (last (file-seq (clojure.java.io/file "resources/public/posts/"))))))

; TODO
; this would be a good opportunity to learn how to add metadata to the blog
; for now though, we'll just extract the info we need
(defn get-blog-summary
  []
  (let [blog (get-latest-blog-post-contents)]
    [(last (str/split (nth blog 1) #":"))
     (last (str/split (nth blog 5) #":"))]))

; should be using destructuring instead
; TODO
(defn latest-blog-post
  []
  (let [latest-blog (get-blog-summary)]
    (hiccup.core/html
      [:h2 {:class "post-title"}
       (first latest-blog)]
      [:p {:class "blog-summary"}
       (last latest-blog)])))

(defn home-page
  []
  (page/html5
    (include-css "/css/styles.css")
    (include-css "https://fonts.googleapis.com/css?family=Passion+One")
    (include-css "https://fonts.googleapis.com/css?family=Roboto")
    (gen-nav-bar)
    (gen-content-container
      (summary)
      (latest-blog-post))))