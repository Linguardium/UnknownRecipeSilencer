package mod.linguardium.unknownrecipes.mixin;

import net.minecraft.client.recipebook.ClientRecipeBook;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.util.Supplier;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(ClientRecipeBook.class)
public class SilenceFiend {
    @Redirect(at=@At(value="INVOKE",target="Lorg/apache/logging/log4j/Logger;warn(Ljava/lang/String;[Lorg/apache/logging/log4j/util/Supplier;)V"),method="getGroupForRecipe")
    private static void silenceFiend(Logger logger, String message, Supplier<?>... paramSuppliers) {
        // stubbed
    }
}
