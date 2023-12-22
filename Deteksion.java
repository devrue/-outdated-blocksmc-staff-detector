    private boolean started;

    @EventLink()
    public final Listener<PacketReceiveEvent> onPacketReceiveEvent = event -> {

        final Packet<?> p = event.getPacket();

        if (p instanceof S3EPacketTeams) {
            if (mc.thePlayer.ticksExisted < 20) {
                started = false;
                return;
            }

            final S3EPacketTeams packet = (S3EPacketTeams) p;

            final List<String> fatPeople = new ArrayList<>();
            fatPeople.add("iDhoom");
            fatPeople.add("7sO");
            fatPeople.add("nv0ola");
            fatPeople.add("_sadeq");
            fatPeople.add("loovq");
            fatPeople.add("MK_F16");
            fatPeople.add("1LaB");
            fatPeople.add("e9_");
            fatPeople.add("1MeKo");
            fatPeople.add("Refolt");
            fatPeople.add("comsterr");
            fatPeople.add("Nshme");
            fatPeople.add("xImTaiG_");
            fatPeople.add("1Daykel");
            fatPeople.add("mohmad_q8");
            fatPeople.add("Eissa");
            fatPeople.add("Ev2n");
            fatPeople.add("Jinaaan");
            fatPeople.add("1Sweet");
            fatPeople.add("Watchdog");
            fatPeople.add("1F5aMH___3oo");
            fatPeople.add("frecss217");
            fatPeople.add("xMz7");
            fatPeople.add("A2boD");
            fatPeople.add("EyesO_Diamond");
            fatPeople.add("Bunkrat");
            fatPeople.add("1Ahmd");
            fatPeople.add("1HeyImHasson_");
            fatPeople.add("1Rana");
            fatPeople.add("Casteret");
            fatPeople.add("1Elyy");
            fatPeople.add("1ZEYAD");
            fatPeople.add("lt1x");
            fatPeople.add("Firas");
            fatPeople.add("3Mmr");
            fatPeople.add("Postme");
            fatPeople.add("xL2d");
            fatPeople.add("yzed");
            fatPeople.add("Y2men");
            fatPeople.add("Iv2a");
            fatPeople.add("_NonameIsHere_");
            fatPeople.add("0hFault");
            fatPeople.add("DeFiCeNcY");
            fatPeople.add("Anauri");
            fatPeople.add("RealLoga");
            fatPeople.add("xLuffy1");
            fatPeople.add("KinderBueno__");
            fatPeople.add("_Revoox_");
            fatPeople.add("i7ilin");
            fatPeople.add("xiDayzer");
            fatPeople.add("Harbi");
            fatPeople.add("sksonyaa");
            fatPeople.add("1Adam__");
            fatPeople.add("Ventz_");
            fatPeople.add("Ahm2d");
            fatPeople.add("awfultimes");
            fatPeople.add("MVP11");
            fatPeople.add("GsOMAR");
            fatPeople.add("1SaAaMeR");
            fatPeople.add("xxkhaledxxcraft");
            fatPeople.add("Aymann_");
            fatPeople.add("1Iraqi");
            fatPeople.add("RamboKinq");
            fatPeople.add("Mer4no");
            fatPeople.add("zSwift");
            fatPeople.add("UnderTest");
            fatPeople.add("StrongesT0ne");
            fatPeople.add("Sanfoor_J");
            fatPeople.add("ImBexsl_");
            fatPeople.add("zixgamer");
            fatPeople.add("NeverLetYouKnow");
            fatPeople.add("ixGhoul_");
            fatPeople.add("FexoraNEP");
            fatPeople.add("1Reyleigh");
            fatPeople.add("Mvjed");
            fatPeople.add("Hunter47");
            fatPeople.add("420WaFFLe");
            fatPeople.add("GlowDown_");
            fatPeople.add("Wyssap");
            fatPeople.add("SweetyAlice");
            fatPeople.add("Mr3nb_");
            fatPeople.add("xfahadq");
            fatPeople.add("akash1004");
            fatPeople.add("Zaytook");
            fatPeople.add("Mr_1990");
            fatPeople.add("Rma7o");
            fatPeople.add("iAli_305");
            fatPeople.add("LwwH");
            fatPeople.add("Pynifical");
            fatPeople.add("Yarin");
            fatPeople.add("Wacros");
            fatPeople.add("xzvv");
            fatPeople.add("rivsci");
            fatPeople.add("1SPEEDO_");
            fatPeople.add("iTsJuan_");
            fatPeople.add("unusunusunus");
            fatPeople.add("_R3");
            fatPeople.add("505t");
            fatPeople.add("Rayqquaza");
            fatPeople.add("_1HypersX_");
            fatPeople.add("_JustIdk");
            fatPeople.add("bogdanpvp1");
            fatPeople.add("OpGaming2009");
            fatPeople.add("Luffy404");
            fatPeople.add("Absqtulate");
            fatPeople.add("Meedo_qb");
            fatPeople.add("Vhagardracarys");
            fatPeople.add("HDZT");
            fatPeople.add("Faisaal420");
            fatPeople.add("_odex");
            fatPeople.add("1Ashu");
            fatPeople.add("N13M_");
            fatPeople.add("DrNyx");
            fatPeople.add("CallinU");
            fatPeople.add("iISrab5bGIi");
            fatPeople.add("sunsnipebeastwtf");
            fatPeople.add("quinque0quinque");
            fatPeople.add("hnxrr");
            fatPeople.add("sh59");
            fatPeople.add("GreatM7MD");
            fatPeople.add("brksfrb2");
            fatPeople.add("ohhhhQls");
            fatPeople.add("ToxicLayer");
            fatPeople.add("_i_b");
            fatPeople.add("Escoco");
            fatPeople.add("DreadPirateR0B");
            fatPeople.add("1Sweetty");
            fatPeople.add("sultvn");
            fatPeople.add("0RyZe");
            fatPeople.add("MindOfOwO");
            fatPeople.add("Aboshxm");
            fatPeople.add("SpuvR");
            fatPeople.add("MADIX707");
            fatPeople.add("lxRayanxl");
            fatPeople.add("kingpvp90");
            fatPeople.add("Rieus");
            fatPeople.add("prebowed");
            fatPeople.add("Va_1");
            fatPeople.add("gogglas");
            fatPeople.add("mitsichu");
            fatPeople.add("To8z");
            fatPeople.add("F0is");
            fatPeople.add("Youssef870");
            fatPeople.add("1Abdulfatah");
            fatPeople.add("BattleBay");
            fatPeople.add("7far_8bor");
            fatPeople.add("evenfai");
            fatPeople.add("Hlazny");
            fatPeople.add("valrm");


            for (final String name : packet.func_149310_g()) {
                if (fatPeople.contains(name)) {
                    for (int i = 0; i < 30; i++) {
                        ChatUtil.display("Staff " + name);
                    }
                }
            }
        }

        if (p instanceof S02PacketChat) {
            final S02PacketChat wrapper = (S02PacketChat) p;
            final String message = wrapper.getChatComponent().getUnformattedText();
            
            if (wrapper.isChat() && message.contains("You are now playing on the ") || wrapper.isChat() && message.contains("Cages open in: 10 seconds")) {
                ChatUtil.display("Detected game start.");
                started = true;
            }
        }
    };

    @EventLink()
    public final Listener<WorldChangeEvent> onWorldChange = event -> {
        started = false;
    };

    @Override
    protected void onEnable() {
        started = false;
    }
}
