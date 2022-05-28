package com.crispytwig.another_furniture.init;

import com.crispytwig.another_furniture.AnotherFurnitureMod;
import com.crispytwig.another_furniture.block.entity.PlanterBoxBlockEntity;
import com.crispytwig.another_furniture.render.CurtainRenderer;
import com.crispytwig.another_furniture.render.PlanterBoxRenderer;
import com.crispytwig.another_furniture.render.SeatRenderer;
import com.crispytwig.another_furniture.render.ShelfRenderer;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModClientSetup {
    @SubscribeEvent
    public static void onFMLCLientSetup(FMLClientSetupEvent event)
    {
        EntityRenderers.register(ModEntities.SEAT.get(), SeatRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.SHELF.get(), ShelfRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.CURTAIN.get(), CurtainRenderer::new);
        BlockEntityRenderers.register(ModBlockEntities.PLANTER_BOX.get(), PlanterBoxRenderer::new);

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMESOPLENTY_CHERRY_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMESOPLENTY_DEAD_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMESOPLENTY_FIR_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMESOPLENTY_HELLBARK_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMESOPLENTY_JACARANDA_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMESOPLENTY_MAGIC_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMESOPLENTY_MAHOGANY_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMESOPLENTY_PALM_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMESOPLENTY_REDWOOD_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMESOPLENTY_UMBRAN_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMESOPLENTY_WILLOW_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ECOLOGICS_AZALEA_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ECOLOGICS_COCONUT_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ECOLOGICS_WALNUT_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMEMAKEOVER_WILLOW_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMEMAKEOVER_SWAMP_CYPRESS_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMEMAKEOVER_BLIGHTED_BALSA_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIOMEMAKEOVER_ANCIENT_OAK_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCED_MUSHROOMS_BROWN_MUSHROOM_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ENHANCED_MUSHROOMS_RED_MUSHROOM_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.QUARK_AZALEA_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.QUARK_BLOSSOM_CHAIR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_SHUTTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.SPRUCE_SHUTTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.BIRCH_SHUTTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.JUNGLE_SHUTTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ACACIA_SHUTTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.DARK_OAK_SHUTTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CRIMSON_SHUTTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.WARPED_SHUTTER.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CURTAIN.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.OAK_PLANTER_BOX.get(), RenderType.cutout());
    }
    public static ModelLayerLocation CURTAIN_MODEL = loc("curtain");

    @SubscribeEvent
    public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(CURTAIN_MODEL, CurtainRenderer::createBodyLayer);
    }

    private static ModelLayerLocation loc(String name) {
        return new ModelLayerLocation(AnotherFurnitureMod.res(name), name);
    }
}
