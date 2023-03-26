(ns learning.courses.alura.legacy.essential.collections.hashmap.map)

;; Created hashmap.
(def inventory {:backpack {:price 100, :quantity 10},
                :boot     {:price 500, :quantity 4},
                :shirt    {:price 10, :quantity 15}})

(defn key-and-value
  [[key value]]
  key value)

(defn price-of-product
  [product]
  (* (:quantity product) (:price product)))

;; Thread Last
(defn price-of-all-products
  [inventory]
  (->> inventory
       vals
       (map price-of-product)
       (reduce +)))

(println (map key-and-value inventory))
(println (price-of-product (-> inventory :backpack)))
(println (price-of-all-products inventory))