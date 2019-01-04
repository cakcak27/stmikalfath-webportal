package ac.id.stmikalfath.app.model;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;

@Builder(toBuilder = true)
@Value
public class ItemDto {
	
	private Long id;
	private String name;
	private Integer price;
	private LocalDateTime createAt;
	
	public static ItemDto of(Long id, String name, Integer price, LocalDateTime createAt){
		return ItemDto.builder()
				.id(id)
				.name(name)
				.price(price)
				.createAt(createAt)
				.build();
	}
}
