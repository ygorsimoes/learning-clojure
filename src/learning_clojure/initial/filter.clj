(ns learning-clojure.initial.filter)

(def my-list [1 2 3 4 5 6 7 8 9 10])

;; Filter is a function that returns a collection of elements that satisfy a predicate.
(filter even? my-list)
(filter odd? my-list)