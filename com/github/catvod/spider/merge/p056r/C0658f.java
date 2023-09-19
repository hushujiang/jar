package com.github.catvod.spider.merge.p056r;

import com.github.catvod.spider.merge.atm;

/* renamed from: com.github.catvod.spider.merge.r.f */
/* loaded from: classes.dex */
final class C0658f extends AbstractC0656d {

    /* renamed from: b */
    static final int f1251b = Integer.numberOfLeadingZeros(31);

    /* renamed from: c */
    static final C0658f f1252c = new C0658f();

    C0658f() {
        super(atm.m897d("29121B0701391E1912103E761D121301292B1A1B19106471"));
    }

    @Override // com.github.catvod.spider.merge.p056r.AbstractC0659g
    /* renamed from: b */
    public final boolean mo136b(char c) {
        return atm.m897d("88FAF896CCD867B8FF97CCD288FAFF97CCD889FAFA97CCF16199FAF5AED8E298FAF6AED9F599FAF5ADC2EA735A97CCDE88FAFB97CCF7A8DA7697CCD189FAFA97CCDC89FAFA96CCD888FAD27FAED8ED99FAF5").charAt((48906 * c) >>> f1251b) == c;
    }
}
