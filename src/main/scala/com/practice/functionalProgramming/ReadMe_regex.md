Here’s a neatly organized cheat sheet for regex patterns, quantifiers, and special sequences:

---

### **Regex Cheat Sheet**

| **Category**         | **Pattern**             | **Description**                                      | **Example**                                |
|-----------------------|-------------------------|------------------------------------------------------|--------------------------------------------|
| **Quantifiers**       | `a+`                   | One or more occurrences of `a`.                     | `"aaabc"` → `"aaa"`                        |
|                       | `a*`                   | Zero or more occurrences of `a`.                    | `"bc"` → `""` (empty match)                |
|                       | `a?`                   | Zero or one occurrence of `a`.                      | `"abc"` → `"a"`                            |
|                       | `a{n}`                 | Exactly `n` occurrences of `a`.                     | `"aaaabc"` → `"aaa"`                       |
|                       | `a{n,}`                | At least `n` occurrences of `a`.                    | `"aaaabc"` → `"aaa"`                       |
|                       | `a{n,m}`               | Between `n` and `m` occurrences of `a`.             | `"aaaa"` → `"aaa"`                         |
| **Character Classes** | `\d`                   | Any digit (0-9).                                    | `"42 apples"` → `"42"`                     |
|                       | `\D`                   | Any non-digit character.                            | `"123abc"` → `"abc"`                       |
|                       | `\w`                   | Word character (letters, digits, underscore).       | `"Hello_world123"` → `"Hello_world123"`    |
|                       | `\W`                   | Non-word character.                                 | `"Hello! How are you?"` → `"! "`           |
|                       | `\s`                   | Whitespace (spaces, tabs, newlines).                | `"Hello world"` → `" "`                    |
|                       | `\S`                   | Non-whitespace character.                           | `"Hello world"` → `"Hello"`                |
|                       | `.`                    | Any character except a newline.                    | `"hat, hot, hut"` → `"hat"`                |
| **Anchors**           | `^`                    | Start of a string.                                  | `"^Hello"` → `"Hello"`                     |
|                       | `$`                    | End of a string.                                    | `"world$"` → `"world"`                     |
| **Groups**            | `(ab)`                 | Capturing group for `ab`.                          | `"abab"` → `"ab"`                          |
|                       | `(?:ab)`               | Non-capturing group for `ab`.                      | `"abab"` → `"ab"`                          |
| **Alternation**       | `a|b`                  | Matches `a` or `b`.                                | `"cat or dog"` → `"cat", "dog"`            |
| **Special Characters**| `\.`                   | Matches the literal `.` character.                 | `"3.14"` → `"3.14"`                        |
|                       | `\[`                   | Matches the literal `[` character.                 | `"text [inside]"` → `"["`                  |
| **Escapes**           | `\\`                   | Escapes special characters.                        | `"C:\\path\\"` → `"C:\path\"`              |

---

### **Examples**

| **Pattern**            | **String**                  | **Matches**                            |
|-------------------------|-----------------------------|-----------------------------------------|
| `\d{3}-\d{3}-\d{4}`     | `"123-456-7890"`           | `"123-456-7890"`                       |
| `[a-z]+`                | `"hello123"`               | `"hello"`                              |
| `[^a-z]+`               | `"hello123"`               | `"123"`                                |
| `\w+@\w+\.\w{2,}`       | `"user@example.com"`       | `"user@example.com"`                   |
| `https?://\S+`          | `"https://example.com"`    | `"https://example.com"`                |
| `(?<=\$)\d+`            | `"$100, $200"`             | `"100", "200"`                         |

This table covers the most commonly used regex patterns and their meanings for quick reference. Let me know if you'd like additional examples or further refinements!