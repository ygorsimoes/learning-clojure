(ns learning-clojure.initial.reduce)

;; Reduce is a function that applies a function to each element of a collection.
(reduce + [1 2 3 4 5])  ;;=> 15
(reduce + [])           ;;=> 0
(reduce + [1])          ;;=> 1
(reduce + [1 2])        ;;=> 3
(reduce + 1 [])         ;;=> 1
(reduce + 1 [2 3])      ;;=> 6

;; Reduce can also take an initial value.
(def my-list [1 2 3 4 5 6 7 8 9 10])
(reduce + 10 my-list)