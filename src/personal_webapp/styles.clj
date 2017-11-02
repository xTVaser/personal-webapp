(ns personal-webapp.styles
  (:require [garden.def :refer [defstylesheet defstyles]]
            [garden.units :refer [px]]))

(defstyles screen
           [:body
            {:font-family 'Roboto
             :background "#f3f3f3"}]

           [:.navbar
            {:font-family "Passion One"
             :padding-top "1em"
             :background "#baafbd"}]

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
            {:margin-top "0.5em"
             :position 'relative
             :z-index 12}]
           [:.nav-link
            {:margin-right "2em"
             :text-decoration 'none
             :color 'white
             :text-shadow "-1px -1px 0 #000, 1px -1px 0 #000, -1px 1px 0 #000, 1px 1px 0 #000"}]
           [:.content
            {:margin-left "25%"
             :margin-right "25%"
             :margin-top "5%"
             :margin-bottom "5%"
             :position 'relative
             :z-index 2}]
           [:.navbar-color-stripe
            {:height "0.25em"
             :background "#f3f3f3"
             :margin-top "0.25em"
             :z-index 10
             ::position 'relative}]

           [:.background-frill
            {:width 0
             :height 0
             :z-index 1
             :position 'absolute
             :top 0
             :border-top "456px solid #5d3d61"
             :border-right "456px solid transparent"}]

           [:.post-title
            {:margin-bottom "0.5em"}]

           [:.heading
            {:margin-bottom "1em"}]

           [:.post
            {:margin-top "5em"}])
