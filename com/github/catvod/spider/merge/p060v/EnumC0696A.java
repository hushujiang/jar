package com.github.catvod.spider.merge.p060v;

import com.github.catvod.spider.merge.atm;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: com.github.catvod.spider.merge.v.A */
/* loaded from: classes.dex */
final class EnumC0696A implements Executor {

    /* renamed from: a */
    public static final EnumC0696A f1312a;

    /* renamed from: b */
    private static final /* synthetic */ EnumC0696A[] f1313b;

    static {
        EnumC0696A enumC0696A = new EnumC0696A();
        f1312a = enumC0696A;
        f1313b = new EnumC0696A[]{enumC0696A};
    }

    private EnumC0696A() {
        atm.m897d("233429210D16293F");
    }

    public static EnumC0696A valueOf(String str) {
        return (EnumC0696A) Enum.valueOf(EnumC0696A.class, str);
    }

    public static EnumC0696A[] values() {
        return (EnumC0696A[]) f1313b.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return atm.m897d("2715081009200F190F01232A19541E1C3E3D090E3F0D293B1F0E15076471");
    }
}
