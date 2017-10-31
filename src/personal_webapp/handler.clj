(ns personal-webapp.handler
  (:require [personal-webapp.views.home :as home-page]
            [personal-webapp.views.blog :as blog-page]
            [personal-webapp.views.contact :as contact-page]
            [personal-webapp.views.projects :as projects-page]
            [personal-webapp.views.404 :as notfound-page]
            [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [clojure.java.io :as io]
            [ring.util.response :as response]))

(defroutes app-routes
   (GET "/" [] (home-page/home-page))
   (GET "/home" [] (home-page/home-page))
   (GET "/blog" [] (blog-page/blog-page))
   (GET "/blog/:post-name" [post-name]
     (if (.exists (io/file (str "resources/public/posts/" post-name ".md")))
        (blog-page/blog-post post-name)
        (notfound-page/no-page)))
   (GET "/contact" [] (contact-page/contact-page))
   (GET "/projects" [] (projects-page/projects-page))
   (route/resources "/")
   (route/not-found (notfound-page/no-page)))

(def app
  (wrap-defaults app-routes site-defaults))
