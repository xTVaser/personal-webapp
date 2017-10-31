(ns personal-webapp.views.404
  (:require [clojure.string :as str]
            [hiccup.page :as page]
            [ring.util.anti-forgery :as util]))

(defn no-page
  []
  (page/html5
    [:h1 "404 Not Found"]))
