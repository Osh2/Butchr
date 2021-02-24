import { useState } from "react"

let eventGuid = 0

export function createEventId() {
  return String(eventGuid++)
}


