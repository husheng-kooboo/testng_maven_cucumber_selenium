package Steps;

import io.cucumber.core.api.TypeRegistry;
import io.cucumber.core.api.TypeRegistryConfigurer;
import io.cucumber.cucumberexpressions.ParameterByTypeTransformer;
import io.cucumber.datatable.DataTableType;
import io.cucumber.datatable.TableCellByTypeTransformer;
import io.cucumber.datatable.TableEntryByTypeTransformer;
import io.cucumber.datatable.TableEntryTransformer;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;

import java.lang.reflect.Type;
import java.util.Locale;
import java.util.Map;

public class Configurer implements TypeRegistryConfigurer {

    @Override
    public Locale locale() {
        return Locale.ENGLISH;
    }

    @Override
    public void configureTypeRegistry(TypeRegistry registry) {
        registry.defineDataTableType(new DataTableType(User.class, new TableEntryTransformer<User>() {
            @Override
            public User transform(Map<String, String> entry) throws Throwable {
                return User.createUser(entry);
            }
        }));
    }

    private class Transformer implements ParameterByTypeTransformer, TableEntryByTypeTransformer, TableCellByTypeTransformer {
        ObjectMapper objectMapper = new ObjectMapper();

        @Override
        public Object transform(String s, Type type) throws Throwable {
            return null;
        }

        @Override
        public <T> T transform(String s, Class<T> aClass) throws Throwable {
            return null;
        }

        @Override
        public <T> T transform(Map<String, String> map, Class<T> aClass, TableCellByTypeTransformer tableCellByTypeTransformer) throws Throwable {
            return null;
        }
//
//        @Override
//        public Object transform(String s, Type type) {
//            return objectMapper.convertValue(s, objectMapper.constructType(type));
//        }
//
//        @Override
//        public <T> T transform(Map<String, String> map, Class<T> aClass, TableCellByTypeTransformer tableCellByTypeTransformer) {
//            return objectMapper.convertValue(map, aClass);
//        }
//
//        @Override
//        public <T> T transform(String s, Class<T> aClass) {
//            return objectMapper.convertValue(s, aClass);
//        }
    }
}