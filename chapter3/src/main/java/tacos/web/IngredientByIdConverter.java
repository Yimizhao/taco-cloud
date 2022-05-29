package tacos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import tacos.Ingredient;
import tacos.Ingredient.Type;
import tacos.data.IngredientRepository;

import java.util.HashMap;
import java.util.Map;

@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    //    Map<String, Ingredient> Ingredientsmap = new HashMap();
//
//    public IngredientByIdConverter() {
//        Ingredientsmap.put("FLTO", new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
//        Ingredientsmap.put("COTO", new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
//        Ingredientsmap.put("GRBF", new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
//        Ingredientsmap.put("CARN", new Ingredient("CARN", "Carnitas", Type.PROTEIN));
//        Ingredientsmap.put("TMTO", new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
//        Ingredientsmap.put("LETC", new Ingredient("LETC", "Lettuce", Type.VEGGIES));
//        Ingredientsmap.put("CHED", new Ingredient("CHED", "Cheddar", Type.CHEESE));
//        Ingredientsmap.put("JACK", new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
//        Ingredientsmap.put("SLSA", new Ingredient("SLSA", "Salsa", Type.SAUCE));
//        Ingredientsmap.put("SRCR", new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
//    }
    private final IngredientRepository ingredientRepo;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepo) {
        this.ingredientRepo = ingredientRepo;
    }

    @Override
    public Ingredient convert(String Id) {
        return this.ingredientRepo.findById(Id).orElse(null);
    }
}
