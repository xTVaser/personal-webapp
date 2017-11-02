(ns personal-webapp.views.common
  (:require [clojure.string :as str]
            [hiccup.page :as page]
            [hiccup.core :as hiccup]
            [ring.util.anti-forgery :as util]))

(defn gen-nav-bar
  []
  (hiccup/html
    [:div {:class "row navbar"}
     [:div {:class "col-1-3 right nav-container"}
      [:a {:class 'nav-link :href "home"} "Home"]
      [:a {:class 'nav-link :href "blog"} "Blog"]]
     [:div {:class "col-1-3 center"}
      [:h1 "Tyler Wilding"]]
     [:div {:class "col-1-3 left nav-container"}
      [:a {:class 'nav-link :href "projects"} "Projects"]
      [:a {:class 'nav-link :href "contact"} "Contact"]]
     [:div {:class 'clear}]
     [:div {:class "row navbar-color-stripe"}]]
    [:div {:class "background-frill"}]))

(defn gen-content-container
  [& content]
  (hiccup/html
    [:div {:class "col-1-2 content"}
     content]
    [:div {:class 'clear}]
    [:br]))