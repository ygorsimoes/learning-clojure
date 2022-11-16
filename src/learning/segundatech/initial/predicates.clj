(ns learning.segundatech.initial.predicates)

;; Predicates are functions which evaluate a condition and return
;; a value true or false (boolean).

;; is a number?
(println (number? 1))
(println (number? "hello"))

;; odd or even?
(println (odd? 3))
(println (even? -2))