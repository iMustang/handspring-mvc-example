package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * User
 *
 * @author: xMustang
 * @since: 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	private Integer id;
	private String name;
	private Integer age;
}
