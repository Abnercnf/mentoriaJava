package files;

import java.util.regex.Pattern;

public enum RegexPattern {
    EMAIL("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");

    private final Pattern pattern;

    RegexPattern(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    public boolean matches(String input) {
        return pattern.matcher(input).matches();
    }
}
