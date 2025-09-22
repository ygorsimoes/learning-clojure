(ns learning-clojure.clojure-camp.first-steps.clamp)

; Write a function clamp to restrict a value to a given range.

; Solution:
(defn clamp
  [x min max]
  (cond
    (< x min) min
    (> x max) max
    :else x))

; Result:
(clamp 2 1 4)
(clamp 0 1 4)
(clamp 5 1 4)