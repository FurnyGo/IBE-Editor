package com.github.franckyi.ibeeditor.common;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.network.chat.TextColor;

import static com.github.franckyi.guapi.api.GuapiHelper.text;
import static com.github.franckyi.guapi.api.GuapiHelper.translated;

public final class ModTexts {
    public static final MutableComponent ADD = translated("ibeeditor.gui.add").withStyle(ChatFormatting.GREEN);
    public static final MutableComponent AMBIENT = translated("ibeeditor.gui.ambient");
    public static final MutableComponent AMOUNT = translated("ibeeditor.gui.amount");
    public static final MutableComponent AMPLIFIER = translated("ibeeditor.gui.amplifier");
    public static final MutableComponent AQUA = translated("ibeeditor.gui.aqua").withStyle(ChatFormatting.AQUA);
    public static final MutableComponent ARMOR_COLOR = translated("ibeeditor.gui.armor_color");
    public static final MutableComponent ATTRIBUTE = translated("ibeeditor.gui.attribute");
    public static final MutableComponent ATTRIBUTE_MODIFIERS = translated("ibeeditor.gui.attribute_modifiers");
    public static final MutableComponent ATTRIBUTE_NAME = translated("ibeeditor.gui.attribute_name");
    public static final MutableComponent BLACK = translated("ibeeditor.gui.black").withStyle(ChatFormatting.AQUA);
    public static final MutableComponent BLOCK = translated("ibeeditor.text.block");
    public static final MutableComponent BLUE = translated("ibeeditor.gui.blue").withStyle(ChatFormatting.BLUE);
    public static final MutableComponent BLUE_COLOR = translated("ibeeditor.gui.blue");
    public static final MutableComponent BOLD = translated("ibeeditor.gui.bold");
    public static final MutableComponent CANCEL = translated("gui.cancel").withStyle(ChatFormatting.RED);
    public static final MutableComponent CAN_DESTROY = translated("ibeeditor.gui.can_destroy");
    public static final MutableComponent CAN_PLACE_ON = translated("ibeeditor.gui.can_place_on");
    public static final MutableComponent CLIENT = translated("ibeeditor.gui.client");
    public static final MutableComponent CLOSE = translated("ibeeditor.gui.close_without_saving").withStyle(ChatFormatting.RED);
    public static final MutableComponent COLLAPSE = translated("ibeeditor.gui.collapse");
    public static final MutableComponent COPY = translated("ibeeditor.gui.copy");
    public static final MutableComponent COUNT = translated("ibeeditor.gui.count");
    public static final MutableComponent CUSTOM_COLOR = translated("ibeeditor.gui.custom_color");
    public static final MutableComponent CUSTOM_NAME = translated("ibeeditor.gui.custom_name");
    public static final MutableComponent CUT = translated("ibeeditor.gui.cut");
    public static final MutableComponent DAMAGE = translated("ibeeditor.gui.damage");
    public static final MutableComponent DARK_AQUA = translated("ibeeditor.gui.dark_aqua").withStyle(ChatFormatting.AQUA);
    public static final MutableComponent DARK_BLUE = translated("ibeeditor.gui.dark_blue").withStyle(ChatFormatting.BLUE);
    public static final MutableComponent DARK_GRAY = translated("ibeeditor.gui.dark_gray").withStyle(ChatFormatting.GRAY);
    public static final MutableComponent DARK_GREEN = translated("ibeeditor.gui.dark_green").withStyle(ChatFormatting.GREEN);
    public static final MutableComponent DARK_PURPLE = translated("ibeeditor.gui.dark_purple").withStyle(ChatFormatting.LIGHT_PURPLE);
    public static final MutableComponent DARK_RED = translated("ibeeditor.gui.dark_red").withStyle(ChatFormatting.RED);
    public static final MutableComponent DEBUG_MODE = translated("ibeeditor.gui.debug_mode");
    public static final MutableComponent DEFAULT_POTION = translated("ibeeditor.gui.default_potion");
    public static final MutableComponent DISPLAY = translated("ibeeditor.gui.display");
    public static final MutableComponent DONE = translated("gui.done").withStyle(ChatFormatting.GREEN);
    public static final MutableComponent DURATION = translated("ibeeditor.gui.duration");
    public static final MutableComponent EFFECT = translated("ibeeditor.gui.effect");
    public static final MutableComponent EFFECTS = translated("ibeeditor.gui.effect");
    public static final MutableComponent ENCHANTMENT = translated("ibeeditor.gui.enchantment");
    public static final MutableComponent ENCHANTMENTS = translated("ibeeditor.gui.enchantments");
    public static final MutableComponent ENTITY = translated("ibeeditor.text.entity");
    public static final MutableComponent EXPAND = translated("ibeeditor.gui.expand");
    public static final MutableComponent FIX_ERRORS = translated("ibeeditor.gui.fix_errors").withStyle(ChatFormatting.RED);
    public static final MutableComponent GENERAL = translated("ibeeditor.gui.general");
    public static final MutableComponent GOLD = translated("ibeeditor.gui.gold").withStyle(ChatFormatting.YELLOW);
    public static final MutableComponent GRAY = translated("ibeeditor.gui.gray").withStyle(ChatFormatting.GRAY);
    public static final MutableComponent GREEN = translated("ibeeditor.gui.green").withStyle(ChatFormatting.GREEN);
    public static final MutableComponent GREEN_COLOR = translated("ibeeditor.gui.green");
    public static final MutableComponent HIDE_FLAGS = translated("ibeeditor.gui.hide_flags");
    public static final MutableComponent[] HIDE_OTHER_TOOLTIP = arrayText("ibeeditor.gui.hide_other_tooltip", 8);
    public static final MutableComponent ITALIC = translated("ibeeditor.gui.italic");
    public static final MutableComponent ITEM = translated("ibeeditor.text.item");
    public static final MutableComponent ITEM_ID = translated("ibeeditor.gui.item_id");
    public static final MutableComponent LEVEL_ADD = translated("ibeeditor.gui.level_add", text("+1")).withStyle(ChatFormatting.GREEN);
    public static final MutableComponent LEVEL_REMOVE = translated("ibeeditor.gui.level_add", text("-1")).withStyle(ChatFormatting.GREEN);
    public static final MutableComponent LIGHT_PURPLE = translated("ibeeditor.gui.light_purple").withStyle(ChatFormatting.LIGHT_PURPLE);
    public static final MutableComponent LORE_ADD = translated("ibeeditor.gui.lore_add");
    public static final MutableComponent MODIFIER = translated("ibeeditor.gui.modifier");
    public static final MutableComponent MOVE_DOWN = translated("ibeeditor.gui.move_down");
    public static final MutableComponent MOVE_UP = translated("ibeeditor.gui.move_up");
    public static final MutableComponent OBFUSCATED = translated("ibeeditor.gui.obfuscated");
    public static final MutableComponent PASTE = translated("ibeeditor.gui.paste");
    public static final MutableComponent POTION = translated("ibeeditor.gui.potion");
    public static final MutableComponent POTION_COLOR = translated("ibeeditor.gui.potion_color");
    public static final MutableComponent POTION_EFFECTS = translated("ibeeditor.gui.potion_effects");
    public static final MutableComponent RED = translated("ibeeditor.gui.red").withStyle(ChatFormatting.RED);
    public static final MutableComponent RED_COLOR = translated("ibeeditor.gui.red");
    public static final MutableComponent RELOAD_CONFIG = translated("ibeeditor.gui.reload_config").withStyle(ChatFormatting.YELLOW);
    public static final MutableComponent REMOVE = translated("ibeeditor.gui.remove").withStyle(ChatFormatting.RED);
    public static final MutableComponent REMOVE_CUSTOM_COLOR = translated("ibeeditor.gui.remove_custom_color").withStyle(ChatFormatting.RED);
    public static final MutableComponent RESET = translated("ibeeditor.gui.reset").withStyle(ChatFormatting.YELLOW);
    public static final MutableComponent RESET_COLOR = translated("ibeeditor.gui.reset_color");
    public static final MutableComponent SAVE = translated("ibeeditor.gui.save").withStyle(ChatFormatting.GREEN);
    public static final MutableComponent SCROLL_FOCUSED = translated("ibeeditor.gui.scroll_focused");
    public static final MutableComponent SEARCH = translated("ibeeditor.gui.search");
    public static final MutableComponent SETTINGS = translated("ibeeditor.gui.settings");
    public static final MutableComponent SHOW_ICON = translated("ibeeditor.gui.show_icon");
    public static final MutableComponent SHOW_PARTICLES = translated("ibeeditor.gui.show_particles");
    public static final MutableComponent SLOT = translated("ibeeditor.gui.slot");
    public static final MutableComponent STRIKETHROUGH = translated("ibeeditor.gui.strikethough");
    public static final MutableComponent THEME = translated("ibeeditor.gui.theme");
    public static final MutableComponent UNBREAKABLE = translated("ibeeditor.gui.unbreakable");
    public static final MutableComponent UNDERLINED = translated("ibeeditor.gui.underline");
    public static final MutableComponent WHITE = translated("ibeeditor.gui.white").withStyle(ChatFormatting.WHITE);
    public static final MutableComponent YELLOW = translated("ibeeditor.gui.yellow").withStyle(ChatFormatting.YELLOW);
    public static final MutableComponent ZOOM_IN = translated("ibeeditor.gui.zoom_in");
    public static final MutableComponent ZOOM_OUT = translated("ibeeditor.gui.zoom_out");
    public static final MutableComponent ZOOM_RESET = translated("ibeeditor.gui.zoom_reset");
    public static final MutableComponent SELECTION_SCREEN_MAX_ITEMS = translated("ibeeditor.gui.selection_screen_max_items");
    public static final MutableComponent LEVEL = translated("ibeeditor.gui.level");
    public static final MutableComponent COMMON = translated("ibeeditor.gui.common");
    public static final MutableComponent PERMISSION_LEVEL = translated("ibeeditor.gui.permission_level");
    public static final MutableComponent CREATIVE_ONLY = translated("ibeeditor.gui.creative_only");
    public static final MutableComponent BLOCK_STATE = translated("ibeeditor.gui.block_state");
    public static final MutableComponent SPAWN_EGG = translated("ibeeditor.gui.spawn_egg");
    public static final MutableComponent CONTAINER = translated("ibeeditor.gui.container");
    public static final MutableComponent LOCK_CODE = translated("ibeeditor.gui.lock_code");
    public static final MutableComponent VAULT = translated("ibeeditor.text.vault");
    public static final MutableComponent HEALTH = translated("ibeeditor.gui.health");
    public static final MutableComponent ALWAYS_SHOW_NAME = translated("ibeeditor.gui.always_show_name");
    public static final MutableComponent INVULNERABLE = translated("ibeeditor.gui.invulnerable");
    public static final MutableComponent SILENT = translated("ibeeditor.gui.silent");
    public static final MutableComponent NO_GRAVITY = translated("ibeeditor.gui.no_gravity");
    public static final MutableComponent GLOWING = translated("ibeeditor.gui.glowing");
    public static final MutableComponent FIRE = translated("ibeeditor.gui.fire");
    public static final MutableComponent SAVE_VAULT = translated("ibeeditor.gui.save_vault");
    public static final MutableComponent SAVE_VAULT_GREEN = translated("ibeeditor.gui.save_vault").withStyle(ChatFormatting.GREEN);
    public static final MutableComponent OPEN_EDITOR = translated("ibeeditor.key.editor");
    public static final MutableComponent OPEN_NBT_EDITOR = translated("ibeeditor.key.nbt_editor");
    public static final MutableComponent OPEN_SNBT_EDITOR = translated("ibeeditor.key.snbt_editor");
    public static final MutableComponent COPY_COMMAND_GREEN = translated("ibeeditor.gui.copy_command_alt").withStyle(ChatFormatting.GREEN);
    public static final MutableComponent FORMAT = translated("ibeeditor.gui.format");

    public static MutableComponent errorServerModRequired(MutableComponent with) {
        return translated("ibeeditor.message.error_server_mod", with).withStyle(ChatFormatting.RED);
    }

    public static MutableComponent errorPermissionDenied(MutableComponent with) {
        return translated("ibeeditor.message.error_permission_denied", with).withStyle(ChatFormatting.RED);
    }

    public static MutableComponent choose(MutableComponent with) {
        return translated("ibeeditor.gui.choose", with);
    }

    public static MutableComponent addTag(String color, String with) {
        var text = translated("ibeeditor.gui.add_tag", text(with));
        TextColor.parseColor(color).result().ifPresent(c -> text.withStyle(style -> style.withColor(c)));
        return text;
    }

    public static MutableComponent editorTitle(MutableComponent type) {
        return title(translated("ibeeditor.gui.editor_title", type));
    }

    public static MutableComponent editorTitle(String type) {
        return editorTitle(text(type));
    }

    public static MutableComponent title(MutableComponent text) {
        return text.withStyle(ChatFormatting.AQUA, ChatFormatting.BOLD);
    }

    public static MutableComponent addListEntry(MutableComponent with) {
        return translated("ibeeditor.gui.add", with);
    }

    public static MutableComponent lore(int i) {
        return translated("ibeeditor.gui.lore", text(Integer.toString(i)));
    }

    public static MutableComponent gui(String s) {
        return translated("ibeeditor.gui." + s);
    }

    public static MutableComponent attributeModifierOperationText(int value) {
        return text("OP: " + value);
    }

    public static MutableComponent attributeModifierOperationTooltip(int value) {
        return translated("ibeeditor.gui.operation", translated("ibeeditor.gui.operation." + value));
    }

    public static MutableComponent hide(MutableComponent with) {
        return translated("ibeeditor.gui.hide", with);
    }

    public static MutableComponent[] savedVault(MutableComponent arg) {
        return arrayTextWithArg("ibeeditor.gui.saved_vault", 4, arg);
    }

    public static MutableComponent copyCommand(String command) {
        return translated("ibeeditor.gui.copy_command", command);
    }

    public static MutableComponent[] commandCopied(String arg) {
        return arrayTextWithArg("ibeeditor.gui.command_copied", 4, arg);
    }

    public static MutableComponent give(MutableComponent with) {
        return translated("ibeeditor.gui.give", with);
    }

    private static MutableComponent[] arrayText(String key, int size) {
        MutableComponent[] array = new MutableComponent[size];
        for (int i = 0; i < size; i++) {
            array[i] = translated(key + "." + i);
        }
        return array;
    }

    public static MutableComponent[] arrayTextWithArg(String key, int size, Object arg) {
        MutableComponent[] array = new MutableComponent[size];
        for (int i = 0; i < size; i++) {
            array[i] = i == 0 ? translated(key + "." + i, arg) : translated(key + "." + i);
        }
        return array;
    }

    public static class Messages {
        public static final MutableComponent ERROR_GENERIC = prefixed(translated("ibeeditor.message.error_generic")).withStyle(ChatFormatting.RED);
        public static final MutableComponent NO_PERMISSION = prefixed(translated("ibeeditor.message.no_permission")).withStyle(ChatFormatting.RED);
        public static final MutableComponent NO_BLOCK_DATA = prefixed(translated("ibeeditor.message.no_block_data")).withStyle(ChatFormatting.RED);
        public static final MutableComponent VAULT_ITEM_GIVE_SUCCESS = prefixed(translated("ibeeditor.message.vault_item_give_success")).withStyle(ChatFormatting.GREEN);

        public static MutableComponent successUpdate(MutableComponent arg) {
            return prefixed(translated("ibeeditor.message.success_update", arg)).withStyle(ChatFormatting.GREEN);
        }

        public static MutableComponent errorServerModRequired(MutableComponent arg) {
            return prefixed(ModTexts.errorServerModRequired(arg)).withStyle(ChatFormatting.RED);
        }

        public static MutableComponent errorPermissionDenied(MutableComponent arg) {
            return prefixed(ModTexts.errorPermissionDenied(arg)).withStyle(ChatFormatting.RED);
        }

        public static MutableComponent errorNoTargetFound(MutableComponent arg) {
            return prefixed(translated("ibeeditor.message.no_target_found", arg)).withStyle(ChatFormatting.RED);
        }

        public static MutableComponent warnNotImplemented(MutableComponent arg) {
            return prefixed(translated("ibeeditor.message.not_implemented", arg)).withStyle(ChatFormatting.YELLOW);
        }

        public static MutableComponent successSavedVault(MutableComponent arg) {
            return prefixed(translated("ibeeditor.message.saved_vault", arg)).withStyle(ChatFormatting.GREEN);
        }

        public static MutableComponent warnNotSavedVault(MutableComponent arg) {
            return prefixed(translated("ibeeditor.message.not_saved_vault", arg)).withStyle(ChatFormatting.YELLOW);
        }

        public static MutableComponent successCopyClipboard(String arg) {
            return prefixed(translated("ibeeditor.message.copied_clipboard", arg)).withStyle(ChatFormatting.GREEN);
        }

        private static MutableComponent prefixed(MutableComponent arg) {
            return translated("chat.type.announcement", translated("ibeeditor"), arg);
        }
    }

    public static class Literal {
        public static final MutableComponent BYTE = text("Byte").withStyle(ChatFormatting.BLUE);
        public static final MutableComponent BYTE_ARRAY = text("Byte Array").withStyle(ChatFormatting.BLUE);
        public static final MutableComponent COMPOUND = text("Compound").withStyle(ChatFormatting.LIGHT_PURPLE);
        public static final MutableComponent DOUBLE = text("Double").withStyle(ChatFormatting.YELLOW);
        public static final MutableComponent FLOAT = text("Float").withStyle(ChatFormatting.LIGHT_PURPLE);
        public static final MutableComponent GREEN = text("List").withStyle(ChatFormatting.GREEN);
        public static final MutableComponent HEX = text("Hex");
        public static final MutableComponent INT = text("Int").withStyle(ChatFormatting.AQUA);
        public static final MutableComponent INT_ARRAY = text("Int Array").withStyle(ChatFormatting.AQUA);
        public static final MutableComponent LONG = text("Long").withStyle(ChatFormatting.RED);
        public static final MutableComponent LONG_ARRAY = text("Long Array").withStyle(ChatFormatting.RED);
        public static final MutableComponent SHORT = text("Short").withStyle(ChatFormatting.GREEN);
        public static final MutableComponent STRING = text("String").withStyle(ChatFormatting.GRAY);
    }
}
