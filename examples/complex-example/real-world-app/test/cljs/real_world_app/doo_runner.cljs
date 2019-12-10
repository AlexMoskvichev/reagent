(ns real-world-app.doo-runner
  (:require [doo.runner :refer-macros [doo-tests]]
            [real-world-app.core-test]))

(doo-tests 'real-world-app.core-test)
