package com.example

import com.example.portal.PORTAL_URL
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class ExampleRobolectricTest {

  @Test
  fun testPortalUrlConfiguredCorrectly() {
    assertEquals("https://sdnjayasari.blogspot.com/2026/11/aplikasi-btq.html", PORTAL_URL)
    assertTrue(PORTAL_URL.startsWith("https://"))
  }
}
