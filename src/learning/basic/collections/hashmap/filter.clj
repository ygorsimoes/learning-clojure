(ns learning.basic.collections.hashmap.filter)

;; Created hashmap.
(def inventory {:backpack {:price 100, :quantity 10},
                :boot     {:price 500, :quantity 4},
                :shirt    {:price 10, :quantity 15}
                :keychain {:quantity 200}})

(defn free?
  [[_ item]]
  (<= (get item :price 0) 0))

(defn paid?
  [inventory]
  (not (free? inventory)))

(println "Products free:" (filter free? inventory))
(println "Products paid:" (filter paid? inventory))