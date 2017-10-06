(ns personal-webapp.views.contact
  (:require [clojure.string :as str]
            [hiccup.page :as page]
            [ring.util.anti-forgery :as util]))

(defn contact-page
  []
  (page/html5
    [:h1 "Contact Page"]))