package com.liferay.damascus.cli.json.fields;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Text
 *
 * @author Yasuyuki Takeo
 */
@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper=false)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Text extends FieldBase{
}
