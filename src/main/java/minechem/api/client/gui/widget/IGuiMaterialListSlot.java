package minechem.api.client.gui.widget;

import java.util.List;

import org.apache.commons.lang3.tuple.Pair;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.item.ItemStack;

/**
 * @author p455w0rd
 *
 */
public interface IGuiMaterialListSlot {

	GuiScreen getGui();

	Pair<ItemStack, Integer> get();

	List<String> getTooltip();

	int getIndex();

	void draw(int x, int y);

}
