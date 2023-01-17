package sapphiregaze.amethystitems.mixin;

import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(LivingEntity.class)
public interface LivingEntityAccessor {
    @Accessor("lastDamageTaken")
    float getLastDamageTaken();

    @Accessor("lastDamageTaken")
    void setLastDamageTaken(float lastDamageTaken);
}
