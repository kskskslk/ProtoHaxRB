/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 */
package dev.sora.relay.cheat.module.impl.other;

import com.nukkitx.protocol.bedrock.packet.DisconnectPacket;
import dev.sora.relay.cheat.module.CheatModule;
import dev.sora.relay.game.event.Listen;
import dev.sora.relay.game.event.impl.EventPacketInbound;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1={"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2={"Ldev/sora/relay/cheat/module/impl/other/AntiKick;", "Ldev/sora/relay/cheat/module/CheatModule;", "()V", "onPacketOutbound", "", "event", "Ldev/sora/relay/game/event/impl/EventPacketInbound;", "ProtoHax"}, k=1, mv={1, 7, 1}, xi=48)
public final class AntiKick
extends CheatModule {
    public AntiKick() {
        super("AntiKick", false, false, 6, null);
    }

    @Listen
    public final void onPacketOutbound(EventPacketInbound eventPacketInbound) {
        Intrinsics.checkNotNullParameter((Object)eventPacketInbound, (String)"event");
        if (eventPacketInbound.getPacket() instanceof DisconnectPacket) {
            this.chat("disconnect: " + ((DisconnectPacket)eventPacketInbound.getPacket()).getKickMessage());
            eventPacketInbound.cancel();
        }
    }
}

