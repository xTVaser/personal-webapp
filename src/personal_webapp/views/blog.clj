(ns personal-webapp.views.blog
  (:use     [markdown.core])
  (:require [clojure.string :as str]
            [personal-webapp.views.common :refer [gen-nav-bar gen-content-container]]
            [hiccup.page :as page :refer [include-css]]
            [ring.util.anti-forgery :as util]
            [ring.util.response :as response]
            [personal-webapp.views.404 :as not-found]))

(defn blog-page
  []
  (page/html5
    (include-css "/css/styles.css")
    (include-css "https://fonts.googleapis.com/css?family=Passion+One")
    (include-css "https://fonts.googleapis.com/css?family=Roboto")
    (gen-nav-bar)
    (gen-content-container "ye")))

(defn blog-post
  [post-name]
  (page/html5
    (md-to-html-string (slurp (str "resources/public/posts/" post-name ".md")))
    ))