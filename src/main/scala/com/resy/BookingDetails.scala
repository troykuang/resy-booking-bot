package com.resy

object BookingDetails {
  // Your user profile Auth Token
  val auth_token: String = AuthKeys.auth_token
  // Your user profile API key
  val api_key: String = AuthKeys.api_key
  // RestaurantId where you want to make the reservation
  val venueId: String = AuthKeys.venueId
  // YYYY-MM-DD of reservation
  val day = "2022-02-09"
  //indoor or outdoor etc. Should match the type exactly on the resy venue
  val dining_type= "Indoor Dining"

  // Seq of YYYY-MM-DD HH:MM:SS times of reservations in military time format
  val times = Seq(
    "2022-02-09 12:00:00",
    "2022-02-09 14:30:00",
    "2022-02-09 12:00:00"
  )
  // Size of party
  val partySize = "2"
}
