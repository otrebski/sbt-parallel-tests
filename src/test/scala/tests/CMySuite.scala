package tests

// For more information on writing tests, see
// https://scalameta.org/munit/docs/getting-started.html
class CMySuite extends munit.FunSuite {
  test("example test that succeeds") {
    val obtained = 42
    val expected = 42
    Thread.sleep(1000)
    assertEquals(obtained, expected)
  }
}
