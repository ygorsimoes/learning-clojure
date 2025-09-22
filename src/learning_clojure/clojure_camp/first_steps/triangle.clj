(ns learning-clojure.clojure-camp.first-steps.triangle)

; Write a function to determine if some 3 side lengths are sufficient to make a triangle.

; To check if 3 sides make a triangle, you need to check that every side is less than
; or equal to the sum of the other two sides.

; Solution:
(defn triangle?
  [x y z]
  (and
    (<= x (+ y z))
    (<= y (+ x z))
    (<= z (+ x y))))

; Result:
(triangle? 3 4 5)
(triangle? 1 1 2)
(triangle? 3 1 1)
