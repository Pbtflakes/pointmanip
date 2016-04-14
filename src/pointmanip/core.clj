(ns pointmanip.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;Takes two points, returns vector of their x-values
(defn pointx
  [p1 p2]
  (vector (get p1 0) (get p2 0)))

;Same as pointx except it returns y-values
(defn pointy
  [p1 p2]
  (vector (get p1 1) (get p2 1)))

