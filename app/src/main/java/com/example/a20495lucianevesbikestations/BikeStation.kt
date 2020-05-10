package com.example.a20495lucianevesbikestations

class BikeStation  (var number: Int, var address: String, var position: Position)

class Position(var lat: Double, var lng: Double)

class Stations (val stations: List<BikeStation>)
