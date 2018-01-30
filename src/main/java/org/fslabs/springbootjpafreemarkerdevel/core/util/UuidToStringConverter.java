/**
 * 
 */
package org.fslabs.springbootjpafreemarkerdevel.core.util;

import java.util.UUID;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * {@link java.util.UUID} &lt;=&gt; {@link java.lang.String}変換を行うJPAコンバーター
 * via
 * https://qiita.com/noxi515/items/e244371b88808af50b9b
 */
@Converter(autoApply = false)
public class UuidToStringConverter implements AttributeConverter<UUID, String>{

    @Override
    public String convertToDatabaseColumn(UUID attribute) {
        return attribute == null ? null : attribute.toString();
    }

    @Override
    public UUID convertToEntityAttribute(String dbData) {
        return dbData == null ? null : UUID.fromString(dbData);
    } 
}