(defproject personal-webapp "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [compojure "1.5.1"]
                 [ring/ring-defaults "0.2.1"]
                 [ring/ring-devel "1.6.2"]
                 [hiccup "1.0.0"]
                 [markdown-clj "1.0.1"]
                 [garden "1.3.3"]
                 [facjure/mesh "0.4.0"]
                 [facjure/gardener "0.1.0"]]
  :plugins [[lein-ring "0.9.7"]
            [lein-garden "0.3.0"]]

  :garden
  {:builds [{:source-paths ["src"]
             :stylesheet personal-webapp.styles/screen
             :compiler {:output-to "resources/public/css/styles.css"}}]}
  :prep-tasks [["garden" "once"]]
:ring {:handler personal-webapp.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
