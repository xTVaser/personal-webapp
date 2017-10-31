(ns personal-webapp.views.home
  (:require [clojure.string :as str]
            [personal-webapp.views.common :refer [gen-nav-bar gen-content-container]]
            [hiccup.page :as page :refer [include-css]]
            [hiccup.core]
            [ring.util.anti-forgery :as util]))


(defn home-page
  []
  (page/html5
    (include-css "/css/styles.css")
    (include-css "https://fonts.googleapis.com/css?family=Passion+One")
    (include-css "https://fonts.googleapis.com/css?family=Roboto")
    (gen-nav-bar)
    (gen-content-container "ye")))
