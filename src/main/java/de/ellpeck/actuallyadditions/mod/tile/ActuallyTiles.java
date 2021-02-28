package de.ellpeck.actuallyadditions.mod.tile;

import de.ellpeck.actuallyadditions.mod.ActuallyAdditions;
import de.ellpeck.actuallyadditions.mod.blocks.ActuallyBlocks;
import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ActuallyTiles {
    public static final DeferredRegister<TileEntityType<?>> TILES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, ActuallyAdditions.MODID);

    //    public static final RegistryObject<,<?>> COMPOST_TILE = TILES.register("compost", () -> TileEntityType.Builder.create(TileEntityCompost::new, InitBlocks.blockCompost.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityFeeder>> FEEDER_TILE = TILES.register("feeder", () -> TileEntityType.Builder.create(TileEntityFeeder::new, ActuallyBlocks.blockFeeder.get()).build(null));
    //    public static final RegistryObject<build<?>> GIANTCHEST_TILE = TILES.register("", () -> TileEntityType.Builder.create(TileEntityGiantChest::new, ).build(null));
    //    public static final RegistryObject<build<?>> GIANTCHESTMEDIUM_TILE = TILES.register("", () -> TileEntityType.Builder.create(TileEntityGiantChestMedium::new, ).build(null));
    //    public static final RegistryObject<build<?>> GIANTCHESTLARGE_TILE = TILES.register("", () -> TileEntityType.Builder.create(TileEntityGiantChestLarge::new, ).build(null));
    public static final RegistryObject<TileEntityType<TileEntityGrinder>> GRINDER_TILE = TILES.register("grinder", () -> TileEntityType.Builder.create(TileEntityGrinder::new, ActuallyBlocks.blockGrinder.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityFurnaceDouble>> FURNACE_DOUBLE_TILE = TILES.register("furnaceDouble", () -> TileEntityType.Builder.create(TileEntityFurnaceDouble::new, ActuallyBlocks.blockFurnaceDouble.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityInputter>> INPUTTER_TILE = TILES.register("inputter", () -> TileEntityType.Builder.create(TileEntityInputter::new, ActuallyBlocks.blockInputter.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityFurnaceSolar>> SOLAR_TILE = TILES.register("solarPanel", () -> TileEntityType.Builder.create(TileEntityFurnaceSolar::new, ActuallyBlocks.blockFurnaceSolar.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityHeatCollector>> HEATCOLLECTOR_TILE = TILES.register("heatCollector", () -> TileEntityType.Builder.create(TileEntityHeatCollector::new, ActuallyBlocks.blockHeatCollector.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityBreaker>> BREAKER_TILE = TILES.register("breaker", () -> TileEntityType.Builder.create(TileEntityBreaker::new, ActuallyBlocks.blockBreaker.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityDropper>> DROPPER_TILE = TILES.register("dropper", () -> TileEntityType.Builder.create(TileEntityDropper::new, ActuallyBlocks.blockDropper.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityInputterAdvanced>> INPUTTERADVANCED_TILE = TILES.register("inputterAdvanced", () -> TileEntityType.Builder.create(TileEntityInputterAdvanced::new, ActuallyBlocks.blockInputterAdvanced.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPlacer>> PLACER_TILE = TILES.register("placer", () -> TileEntityType.Builder.create(TileEntityPlacer::new, ActuallyBlocks.blockPlacer.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityGrinderDouble>> GRINDER_DOUBLE_TILE = TILES.register("grinderDouble", () -> TileEntityType.Builder.create(TileEntityGrinderDouble::new, ActuallyBlocks.blockGrinderDouble.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityCanolaPress>> CANOLAPRESS_TILE = TILES.register("canolaPress", () -> TileEntityType.Builder.create(TileEntityCanolaPress::new, ActuallyBlocks.blockCanolaPress.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityFermentingBarrel>> FERMENTINGBARREL_TILE = TILES.register("fermentingBarrel", () -> TileEntityType.Builder.create(TileEntityFermentingBarrel::new, ActuallyBlocks.blockFermentingBarrel.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityOilGenerator>> OILGENERATOR_TILE = TILES.register("oilGenerator", () -> TileEntityType.Builder.create(TileEntityOilGenerator::new, ActuallyBlocks.blockOilGenerator.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityCoalGenerator>> COALGENERATOR_TILE = TILES.register("coalGenerator", () -> TileEntityType.Builder.create(TileEntityCoalGenerator::new, ActuallyBlocks.blockCoalGenerator.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPhantomItemface>> PHANTOMITEMFACE_TILE = TILES.register("phantomface", () -> TileEntityType.Builder.create(TileEntityPhantomItemface::new, ActuallyBlocks.blockPhantomface.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPhantomLiquiface>> PHANTOMLIQUIFACE_TILE = TILES.register("liquiface", () -> TileEntityType.Builder.create(TileEntityPhantomLiquiface::new, ActuallyBlocks.blockPhantomLiquiface.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPhantomEnergyface>> PHANTOMENERGYFACE_TILE = TILES.register("energyface", () -> TileEntityType.Builder.create(TileEntityPhantomEnergyface::new, ActuallyBlocks.blockPhantomEnergyface.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPlayerInterface>> PLAYERINTERFACE_TILE = TILES.register("playerInterface", () -> TileEntityType.Builder.create(TileEntityPlayerInterface::new, ActuallyBlocks.blockPlayerInterface.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPhantomPlacer>> PHANTOMPLACER_TILE = TILES.register("phantomPlacer", () -> TileEntityType.Builder.create(TileEntityPhantomPlacer::new, ActuallyBlocks.blockPhantomPlacer.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPhantomBreaker>> PHANTOMBREAKER_TILE = TILES.register("phantomBreaker", () -> TileEntityType.Builder.create(TileEntityPhantomBreaker::new, ActuallyBlocks.blockPhantomBreaker.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityFluidCollector>> FLUIDCOLLECTOR_TILE = TILES.register("fluidCollector", () -> TileEntityType.Builder.create(TileEntityFluidCollector::new, ActuallyBlocks.blockFluidCollector.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityFluidPlacer>> FLUIDPLACER_TILE = TILES.register("fluidPlacer", () -> TileEntityType.Builder.create(TileEntityFluidPlacer::new, ActuallyBlocks.blockFluidPlacer.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityLavaFactoryController>> LAVAFACTORYCONTROLLER_TILE = TILES.register("lavaFactory", () -> TileEntityType.Builder.create(TileEntityLavaFactoryController::new, ActuallyBlocks.blockLavaFactoryController.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityCoffeeMachine>> COFFEEMACHINE_TILE = TILES.register("coffeeMachine", () -> TileEntityType.Builder.create(TileEntityCoffeeMachine::new, ActuallyBlocks.blockCoffeeMachine.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPhantomBooster>> PHANTOM_BOOSTER_TILE = TILES.register("phantomBooster", () -> TileEntityType.Builder.create(TileEntityPhantomBooster::new, ActuallyBlocks.blockPhantomBooster.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityEnergizer>> ENERGIZER_TILE = TILES.register("energizer", () -> TileEntityType.Builder.create(TileEntityEnergizer::new, ActuallyBlocks.blockEnergizer.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityEnervator>> ENERVATOR_TILE = TILES.register("enervator", () -> TileEntityType.Builder.create(TileEntityEnervator::new, ActuallyBlocks.blockEnervator.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityXPSolidifier>> XPSOLIDIFIER_TILE = TILES.register("xpSolidifier", () -> TileEntityType.Builder.create(TileEntityXPSolidifier::new, ActuallyBlocks.blockXPSolidifier.get()).build(null));
    //    public static final RegistryObject<.<?>> SMILEYCLOUD_TILE = TILES.register("", () -> TileEntityType.Builder.create(TileEntitySmileyCloud::new, InitBlocks.blockSmileyCloud.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityLeafGenerator>> LEAFGENERATOR_TILE = TILES.register("leafGenerator", () -> TileEntityType.Builder.create(TileEntityLeafGenerator::new, ActuallyBlocks.blockLeafGenerator.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityDirectionalBreaker>> DIRECTIONALBREAKER_TILE = TILES.register("directionalBreaker", () -> TileEntityType.Builder.create(TileEntityDirectionalBreaker::new, ActuallyBlocks.blockDirectionalBreaker.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityRangedCollector>> RANGEDCOLLECTOR_TILE = TILES.register("rangedCollector", () -> TileEntityType.Builder.create(TileEntityRangedCollector::new, ActuallyBlocks.blockRangedCollector.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityAtomicReconstructor>> ATOMICRECONSTRUCTOR_TILE = TILES.register("reconstructor", () -> TileEntityType.Builder.create(TileEntityAtomicReconstructor::new, ActuallyBlocks.blockAtomicReconstructor.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityMiner>> MINER_TILE = TILES.register("miner", () -> TileEntityType.Builder.create(TileEntityMiner::new, ActuallyBlocks.blockMiner.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityFireworkBox>> FIREWORKBOX_TILE = TILES.register("fireworkBox", () -> TileEntityType.Builder.create(TileEntityFireworkBox::new, ActuallyBlocks.blockFireworkBox.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityPhantomRedstoneface>> PHANTOMREDSTONEFACE_TILE = TILES.register("redstoneface", () -> TileEntityType.Builder.create(TileEntityPhantomRedstoneface::new, ActuallyBlocks.blockPhantomRedstoneface.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityLaserRelayItem>> LASERRELAYITEM_TILE = TILES.register("laserRelayItem", () -> TileEntityType.Builder.create(TileEntityLaserRelayItem::new, ActuallyBlocks.blockLaserRelayItem.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityLaserRelayEnergy>> LASERRELAYENERGY_TILE = TILES.register("laserRelay", () -> TileEntityType.Builder.create(TileEntityLaserRelayEnergy::new, ActuallyBlocks.blockLaserRelay.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityLaserRelayEnergyAdvanced>> LASERRELAYENERGYADVANCED_TILE = TILES.register("laserRelayAdvanced", () -> TileEntityType.Builder.create(TileEntityLaserRelayEnergyAdvanced::new, ActuallyBlocks.blockLaserRelayAdvanced.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityLaserRelayEnergyExtreme>> LASERRELAYENERGYEXTREME_TILE = TILES.register("laserRelayExtreme", () -> TileEntityType.Builder.create(TileEntityLaserRelayEnergyExtreme::new, ActuallyBlocks.blockLaserRelayExtreme.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityLaserRelayItemWhitelist>> LASERRELAYITEMWHITELIST_TILE = TILES.register("laserRelayItemWhitelist", () -> TileEntityType.Builder.create(TileEntityLaserRelayItemWhitelist::new, ActuallyBlocks.blockLaserRelayItemWhitelist.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityItemViewer>> ITEMVIEWER_TILE = TILES.register("itemViewer", () -> TileEntityType.Builder.create(TileEntityItemViewer::new, ActuallyBlocks.blockItemViewer.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityDisplayStand>> DISPLAYSTAND_TILE = TILES.register("displayStand", () -> TileEntityType.Builder.create(TileEntityDisplayStand::new, ActuallyBlocks.blockDisplayStand.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityShockSuppressor>> SHOCKSUPPRESSOR_TILE = TILES.register("shockSuppressor", () -> TileEntityType.Builder.create(TileEntityShockSuppressor::new, ActuallyBlocks.blockShockSuppressor.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityEmpowerer>> EMPOWERER_TILE = TILES.register("empowerer", () -> TileEntityType.Builder.create(TileEntityEmpowerer::new, ActuallyBlocks.blockEmpowerer.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityLaserRelayFluids>> LASERRELAYFLUIDS_TILE = TILES.register("laserRelayFluids", () -> TileEntityType.Builder.create(TileEntityLaserRelayFluids::new, ActuallyBlocks.blockLaserRelayFluids.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityBioReactor>> BIOREACTOR_TILE = TILES.register("bioReactor", () -> TileEntityType.Builder.create(TileEntityBioReactor::new, ActuallyBlocks.blockBioReactor.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityFarmer>> FARMER_TILE = TILES.register("farmer", () -> TileEntityType.Builder.create(TileEntityFarmer::new, ActuallyBlocks.blockFarmer.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityItemViewerHopping>> ITEMVIEWERHOPPING_TILE = TILES.register("itemViewerHopping", () -> TileEntityType.Builder.create(TileEntityItemViewerHopping::new, ActuallyBlocks.blockItemViewer.get()).build(null));
    public static final RegistryObject<TileEntityType<TileEntityBatteryBox>> BATTERYBOX_TILE = TILES.register("batteryBox", () -> TileEntityType.Builder.create(TileEntityBatteryBox::new, ActuallyBlocks.blockBatteryBox.get()).build(null));
}