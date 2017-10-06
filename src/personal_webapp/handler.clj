(ns personal-webapp.handler
  (:require [personal-webapp.views.home :as home-page]
            [personal-webapp.views.blog :as blog-page]
            [personal-webapp.views.contact :as contact-page]
            [personal-webapp.views.projects :as projects-page]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]))

; http://clojure-doc.org/articles/tutorials/basic_web_development.html#create-your-views

(defroutes app-routes
           (GET "/" [] (home-page/home-page))
           (GET "/home" [] (home-page/home-page))
           (GET "/blog" [] (blog-page/blog-page))
           (GET "/contact" [] (contact-page/contact-page))
           (GET "/projects" [] (projects-page/projects-page))
           ;(GET "/blog/:post-id" [post-id] (views/blog-post post-id))
           (route/resources "/")
           (route/not-found "Not Found"))

(def app
  (wrap-defaults app-routes site-defaults))
