(ns learning-clojure.clojure-camp.first-steps.classify-triangle)

; Write a function classify-triangle, which, given 3 numbers, returns whether a triangle is equilateral
; (3 equal sides), isosceles (2 equal sides), scalene, or, not a triangle.

; Solution:
(defn triangle?
  [x y z]
  (and
    (< x (+ y z))
    (< y (+ x z))
    (< z (+ x y))))

(defn classify-triangle
  [x, y, z]
  (cond
    (not (triangle? x y z)) :invalid
    (= x y z) :equilateral
    (or (= x y) (= x z) (= y z)) :isosceles
    :else :scalene))


; Result:
(classify-triangle 1 1 1)
(classify-triangle 0 0 0)
(classify-triangle 1 1 2)
(classify-triangle 4 4 5)
(classify-triangle 3 4 5)