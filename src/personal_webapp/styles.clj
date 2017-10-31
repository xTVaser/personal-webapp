(ns personal-webapp.styles
  (:require [garden.def :refer [defstylesheet defstyles]]
            [garden.units :refer [px]]))

(defstyles screen
           [:body
            {:font-family 'Roboto}]

           [:.navbar
            {:font-family "Passion One"
             :padding-top "1em"
             :padding-bottom "1em"}]

           [:.navbar :h1
            {:font-weight 'normal}]

           [:*
            {:margin 0
             :padding 0}]

           [:.clear
            {:clear 'both
             :line-height 0}]

           [:.col-1-8
            {:width "12.5%"
             :float 'left}]

           [:.col-1-4
            {:width "25%"
             :float 'left}]

           [:.col-1-3
            {:width "33.33%"
             :float 'left}]

           [:.col-1-2
            {:width "50%"
             :float 'left}]

           [:.col-2-3
            {:width "66.66%"
             :float 'left}]

           [:.col-3-4
            {:width "75%"
             :float 'left}]

           [:.row
            {:width "100%"}]

           [:.center
            {:display 'block
             :text-align 'center}]

           [:.left
            {:display 'block
             :text-align 'left}]

           [:.right
            {:display 'block
             :text-align 'right}]

           [:.nav-container
            {:margin-top "0.5em"}]
           [:.nav-link
            {:margin-right "2em"
             :text-decoration 'none}]
           [:.content
            {:margin-left "12.5%"
             :margin-right "12.5%"
             :margin-top "5%"
             :margin-bottom "5%"}])
