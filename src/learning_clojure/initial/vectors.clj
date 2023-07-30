(ns learning-clojure.initial.vectors)

;; Vectors are defined with [ $ $ $ ]
(def numbers [1, 2, 3, 4, 5, 6, 7, 8, 9, 10])
(def fruits ["Banana", "Apple", "Orange", "Grape"])

;; Return true if the parameter is a vector.
(vector? numbers)
(vector? fruits)

;; Return the element of the vector.
(get numbers 2)
(get fruits 2)

;; Return the element of the vector or the default value if the element not exists.
(get numbers 2 "not exists")
(get numbers 15 "not exists")

;; Returns the number of items in the collection.
(count numbers)
(count fruits)

;; Returns the new vector with the new element.
(conj numbers 11)
(conj fruits "Watermelon")

;; Returns the new vector with the first element inc/+1 and dec/-1.
(update numbers 0 inc)
(update numbers 0 dec)

;; Returns the new vector with the new element in the index.
(update fruits 0 str " - Fruit")
(update fruits 1 str " - Fruit")