# CarServiceRest

## Get the list of cars to be rented

curl http://localhost:8080/cars

Returns:

[{"plateNumber":"11AA22","brand":"Ferrari","price":1000},{"plateNumber":"22BB44","brand":"Porshe","price":2000}]

## Rent a car

curl --request PUT --url http://localhost:8080/cars/11AA22 --data 'rent=true'

## Get back a car

curl --request PUT --url http://localhost:8080/cars/11AA22 --data 'rent=false'
