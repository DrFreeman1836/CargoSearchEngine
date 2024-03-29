package main.enam;

public enum ParseMode {

  HTML("HTML"),
  NON(null);

  private final String parseMode;

  ParseMode(String parseMode) {
    this.parseMode = parseMode;
  }

  public String getParseMode() {
    return parseMode;
  }

}
