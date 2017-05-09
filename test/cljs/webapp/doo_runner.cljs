(ns webapp.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [webapp.core-test]))

(doo-tests 'webapp.core-test)

