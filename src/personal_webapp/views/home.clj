(ns personal-webapp.views.home
  (:require [clojure.string :as str]
            [hiccup.page :as page]
            [ring.util.anti-forgery :as util]))

(defn home-page
  []
  (page/html5
    [:h1 "Home"]))