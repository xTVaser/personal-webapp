(ns personal-webapp.views.projects
  (:require [clojure.string :as str]
            [hiccup.page :as page]
            [ring.util.anti-forgery :as util]))

(defn projects-page
  []
  (page/html5
    [:h1 "Project Page"]))