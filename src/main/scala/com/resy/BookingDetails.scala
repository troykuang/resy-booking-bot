package com.resy

object BookingDetails {
  // Your user profile Auth Token
  val auth_token: String = AuthKeys.auth_token
  // Your user profile API key
  val api_key: String = AuthKeys.api_key
  // RestaurantId where you want to make the reservation
  val venueId: String = AuthKeys.venueId
  // YYYY-MM-DD of reservation
  val day: String = AuthKeys.pref_day

  //indoor or outdoor etc. Should match the type exactly on the resy venue (case doesn't matter). Leave blank if you don't care or don't now
  val dining_type= "Indoor Dining Room"

  // Seq of YYYY-MM-DD HH:MM:SS times of reservations in military time format
  val times: Seq[String] = AuthKeys.pref_times

  // Size of party
  val partySize = "2"
}
