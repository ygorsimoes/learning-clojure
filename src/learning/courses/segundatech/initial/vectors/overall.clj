(ns learning.courses.segundatech.initial.vectors.overall)

;; [n1 n2 n3...] - basic vector
[1 2 3]

;; (count [n1, n2, n3...]) - returns the total number of elements in the vector
(count [1 2 3])

;; (conj [n1 n2 n3...] x) - add the element in vector
(conj [1 2 3] 4)

;; (pop [n1 n2 n3...]) - remove last element
(pop [1 2 3])

;; (peek [n1 n2 n3...]) - return last element
(peek [1 2 3])

;; (get [n1 n2 n3...] x) - returns the element at the specified position
(get [1 2 3] 2)
(get [1 2 3] 0)
(get [1 2 3] 3 "no element")

;; (assoc [n1 n2 n3] x y) - associates an element in the list at a given position.
(assoc [1 2 3] 0 3)
(assoc [1 2 3] 1 2)
(assoc (assoc [1 2 3] 0 3) 1 3 )