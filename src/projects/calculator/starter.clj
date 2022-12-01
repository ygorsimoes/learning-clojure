(ns projects.calculator.starter)

(require '[learning.projects.calculator.simple-calculator :as simple-calculator])

;; How to use the simple-calculator:
;; 1 is Sum;
;; 2 is Sub;
;; 3 is Multi;
;; 4 is Div;
(println (simple-calculator/calculator 4 4 2))