package JavaLibrariesInScala

import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.LocalDate;
import java.util.Locale._;
object JavaTimeLibraries {
  def main(args:Array[String]):Unit={
    val now = LocalDate.now();
    val dateFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(FRANCE);
    println(dateFormat.format(now))
  }
}
