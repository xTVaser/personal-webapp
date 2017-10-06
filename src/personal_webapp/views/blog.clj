(ns personal-webapp.views.blog
  (:require [clojure.string :as str]
            [hiccup.page :as page]
            [ring.util.anti-forgery :as util]))

(defn blog-page
  []
  (page/html5
    [:h1 "Blog Page"]))