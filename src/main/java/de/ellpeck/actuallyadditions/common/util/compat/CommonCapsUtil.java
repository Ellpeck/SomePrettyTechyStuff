// @todo: check to see if any mod takes over for this one
//package de.ellpeck.actuallyadditions.common.util.compat;
//
//import org.cyclops.commoncapabilities.api.capability.itemhandler.DefaultSlotlessItemHandlerWrapper;
//import org.cyclops.commoncapabilities.api.capability.itemhandler.ISlotlessItemHandler;
//
//import de.ellpeck.actuallyadditions.common.tile.TileEntityItemViewer;
//import de.ellpeck.actuallyadditions.common.tile.TileEntityItemViewer.SlotlessItemHandlerInfo;
//import de.ellpeck.actuallyadditions.common.util.StackUtil;
//import net.minecraft.item.ItemStack;
//import net.minecraftforge.items.IItemHandler;
//
//public final class CommonCapsUtil {
//
//    public static ISlotlessItemHandler createSlotlessItemViewerHandler(final TileEntityItemViewer tile, IItemHandler normalHandler) {
//        return new DefaultSlotlessItemHandlerWrapper(normalHandler) {
//            @Override
//            public ItemStack insertItem(ItemStack stack, boolean simulate) {
//                ItemStack remain = stack.copy();
//                for (SlotlessItemHandlerInfo handler : tile.slotlessInfos) {
//                    if (handler.isLoaded() && tile.isWhitelisted(handler, stack, false)) {
//                        if (handler.handler instanceof ISlotlessItemHandler) {
//                            remain = ((ISlotlessItemHandler) handler.handler).insertItem(stack, simulate);
//
//                            if (!ItemStack.areItemStacksEqual(remain, stack) && !simulate) {
//                                tile.markDirty();
//                                tile.doItemParticle(stack, handler.relayInQuestion.getPos(), tile.connectedRelay.getPos());
//                            }
//
//                            if (!StackUtil.isValid(remain)) { return StackUtil.getEmpty(); }
//                        }
//                    }
//                }
//                return super.insertItem(remain, simulate);
//            }
//
//            @Override
//            public ItemStack extractItem(int amount, boolean simulate) {
//                for (SlotlessItemHandlerInfo handler : tile.slotlessInfos) {
//                    if (handler.isLoaded()) {
//                        if (handler.handler instanceof ISlotlessItemHandler) {
//                            ISlotlessItemHandler slotless = (ISlotlessItemHandler) handler.handler;
//
//                            ItemStack would = slotless.extractItem(amount, true);
//                            if (StackUtil.isValid(would)) {
//                                if (tile.isWhitelisted(handler, would, true)) {
//                                    ItemStack has;
//                                    if (simulate) {
//                                        has = would;
//                                    } else {
//                                        has = slotless.extractItem(amount, false);
//                                    }
//
//                                    if (StackUtil.isValid(has) && !simulate) {
//                                        tile.markDirty();
//                                        tile.doItemParticle(has, tile.connectedRelay.getPos(), handler.relayInQuestion.getPos());
//                                    }
//
//                                    return has;
//                                }
//                            }
//                        }
//                    }
//                }
//                return super.extractItem(amount, simulate);
//            }
//
//            @Override
//            public ItemStack extractItem(ItemStack matchStack, int matchFlags, boolean simulate) {
//                for (SlotlessItemHandlerInfo handler : tile.slotlessInfos) {
//                    if (handler.isLoaded()) {
//                        if (handler.handler instanceof ISlotlessItemHandler) {
//                            ISlotlessItemHandler slotless = (ISlotlessItemHandler) handler.handler;
//
//                            ItemStack would = slotless.extractItem(matchStack, matchFlags, true);
//                            if (StackUtil.isValid(would)) {
//                                if (tile.isWhitelisted(handler, would, true)) {
//                                    if (simulate) {
//                                        return would;
//                                    } else {
//                                        return slotless.extractItem(matchStack, matchFlags, false);
//                                    }
//                                }
//                            }
//                        }
//                    }
//                }
//                return super.extractItem(matchStack, matchFlags, simulate);
//            }
//        };
//    }
//
//}
